import java.util.List;
import java.util.ArrayList;

public class Artist{

  private String mName;
  private List<CD> mCds;
  private static ArrayList<Artist> artists = new ArrayList<Artist>();
  private int mId;

  public Artist(String name) {
    mName = name;
    artists.add(this);
    mId = artists.size();
    mCds = new ArrayList<CD>();
  }

  public String getName() {
    return mName;
  }

  public static List<Artist> all() {
    return artists;
  }

  public static void clear() {
    artists.clear();
  }

  public int getId() {
    return mId;
  }

  public static Artist find(int id) {
    return artists.get(id - 1);
  }
  public List<CD> getCds(){
    return mCds;
  }
  public void addCD(CD cd) {
    mCds.add(cd);
  }
}
