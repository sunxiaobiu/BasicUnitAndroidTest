import android.content.ClipData;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0342B657D749C98151D37798B802B4ABEC984A561FDF222268125A1719F454FB_223476615 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      ClipData var1 = ClipData.newRawUri("", (Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
