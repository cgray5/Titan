package titanmusicplayer.dal;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import titanmusicplayer.entity.Mp3s;

public class Mp3sTableModel extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private ArrayList<Mp3s> Mp3sList;
    
    public Mp3sTableModel()
    {
        super();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        
        Query q=session.createQuery("from Mp3s");
        Mp3sList=new ArrayList<Mp3s>(q.list());
        
        session.close();
        sf.close();
    }

    public int getNumberOfRows()
    {
        return Mp3sList.size();
    }

    public int getNumberOfColumns()
    {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Mp3s mp3 = Mp3sList.get(rowIndex);
        Object[] values=new Object[]{mp3.getMp3id(),mp3.getTitle(),mp3.getArtist(),
                mp3.getAlbum(),mp3.getLength(), mp3.getReleaseDate()};
        return values[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Mp3ID","title","artist","album","length","releaseDate",};
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}