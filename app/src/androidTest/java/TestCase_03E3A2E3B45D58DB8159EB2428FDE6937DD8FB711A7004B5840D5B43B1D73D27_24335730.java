import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03E3A2E3B45D58DB8159EB2428FDE6937DD8FB711A7004B5840D5B43B1D73D27_24335730 {
   @Test
   public void testCase() throws Exception {
      Intent var3 = new Intent("android.intent.action.VIEW");
      Object var1 = EasyMock.createMock(Uri.class);
      String var2 = "android";
      var3.setDataAndTypeAndNormalize((Uri)var1, var2);
   }
}
