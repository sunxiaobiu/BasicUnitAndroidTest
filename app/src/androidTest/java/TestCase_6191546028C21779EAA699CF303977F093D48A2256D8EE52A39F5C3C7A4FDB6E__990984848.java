import android.net.Uri;
import android.provider.MediaStore.Audio.Artists.Albums;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6191546028C21779EAA699CF303977F093D48A2256D8EE52A39F5C3C7A4FDB6E__990984848 {
   public static void testCase() throws Exception {
      long var1 = 1L;
      Uri var0 = Albums.getContentUri("external", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
