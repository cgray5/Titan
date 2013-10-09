/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanmusicplayer.dal;

import com.sun.org.apache.xpath.internal.operations.String;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import titanmusicplayer.entity.Mp3s;
import titanmusicplayer.util.HibernateUtil;

/**
 *
 * @author paws
 */
public class Mp3Upload 
{
  
/**
* Inserts a row in the Mp3s table.
* Do not need to pass the id, it will be generated.
* @param mp3
* @return an instance of the object Mp3s
*/
    
    
 private Mp3s m;
 private static HibernateUtil retriever;
 private static Session session;
 

 public static void saveMp3(int mp3id, String title, String artist, String album, Date length, Date releaseDate)
 {
	session = retriever.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
        titanmusicplayer.entity.Mp3s newMp3 = new titanmusicplayer.entity.Mp3s();
        session.save(newMp3);
        transaction.commit();
        session.close();       
 }

/**
 * Delete a book from database
 * @param bookId id of the book to be retrieved
 */
 
 public Mp3s deleteMp3(int Mp3ID)
 {
  Session session = HibernateUtil.getSessionFactory().openSession();
 
  try {
	   Mp3s mp3 = (Mp3s) session.get(Mp3s.class, Mp3ID);
       return mp3;
      } 
  catch (HibernateException e) 
      {
       e.printStackTrace();
      } 
  finally 
     {
      session.close();
     }
  return null;
 }

}  

