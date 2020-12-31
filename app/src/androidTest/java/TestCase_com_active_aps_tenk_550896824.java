import android.content.ContentResolver;
import android.provider.MediaStore.Audio.Playlists.Members;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_tenk_550896824 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      long var1 = 1L;
      byte var3 = 1;
      byte var4 = 1;
      Members.moveItem((ContentResolver)var0, var1, var3, var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
