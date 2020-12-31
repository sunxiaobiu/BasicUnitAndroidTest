import android.content.ContentResolver;
import android.provider.MediaStore.Images.Media;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__1094122616 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      String var1 = "android";
      String var2 = "android";
      String var3 = "android";
      Media.insertImage((ContentResolver)var0, var1, var2, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
