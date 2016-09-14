import org.junit.*;
import static org.junit.Assert.*;

public class ArtistTest {

  @Test
  public void artist_instantiatesCorrectly_true() {
    Artist newArtist = new Artist("Guy");
    assertEquals(true, newArtist instanceof Artist);
  }

  @Test
  public void artist_getsName_name() {
    Artist artist = new Artist("Lou Reed");
    assertEquals("Lou Reed", artist.getName());
  }

  @Test
  public void artist_returnsAllInstancesOfArtist_true() {
    Artist artistOne = new Artist("Lou Reed");
    Artist artistTwo = new Artist("David Bowie");
    assertEquals(true, Artist.all().contains(artistOne));
    assertEquals(true, Artist.all().contains(artistTwo));
  }

  @Test
  public void clear_emptiesAllArtists_0() {
    Artist artistOne = new Artist("Lou Reed");
    Artist.clear();
    assertEquals(Artist.all().size(), 0);
  }

  @Test
  public void getId_artistsInstantiateWithAnId_1() {
    Artist.clear();
    Artist artistOne = new Artist("Lou Reed");
    assertEquals(1, artistOne.getId());
  }

  @Test
  public void find_returnsArtistWithId_artistTwo() {
    Artist.clear();
    Artist artistOne = new Artist("Lou Reed");
    Artist artistTwo = new Artist("David Bowie");
    assertEquals(Artist.find(artistTwo.getId()), artistTwo);
  }
  @Test
  public void getCds_initiallyReturnsEmptyList_ArrayList() {
    Artist.clear();
    Artist artist = new Artist("David Bowie");
    assertEquals(0, artist.getCds().size());
  }
  @Test
  public void addCD_addsCDToList_true() {
    Artist artist = new Artist("David Bowie");
    CD cd = new CD("David Bowie", "album", "year", "description");
    artist.addCD(cd);
    assertTrue(artist.getCds().contains(cd));
  }
}
