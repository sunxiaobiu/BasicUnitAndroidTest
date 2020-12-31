import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_landsharkgames_zenkoi_android_1901435145 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      String var2 = ((Intent)var1).getStringExtra("url");
      var1 = EasyMock.createMock(String.class);
      Uri var3 = Uri.parse((String)var1);
      var2 = var3.getFragment();
   }
}
