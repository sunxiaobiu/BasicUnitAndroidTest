import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_RustyLake_CubeEscapeTheCave_1833433119 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Uri var2 = ((Intent)var1).getData();
      String var3 = var2.getEncodedAuthority();
   }
}
