import android.text.Html;
import android.text.Spanned;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_androix_com_android_NightVisionCam_24863063 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spanned.class);
      String var1 = Html.toHtml((Spanned)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
