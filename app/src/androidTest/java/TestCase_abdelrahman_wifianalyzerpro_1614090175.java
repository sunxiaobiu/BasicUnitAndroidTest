import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro_1614090175 {
   @Test
   public void testCase() throws Exception {
      Intent var3 = new Intent();
      Object var1 = EasyMock.createMock(Uri.class);
      String var2 = "android";
      var3.setDataAndType((Uri)var1, var2);
   }
}
