import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59C66D90F3DD3BA62909DE65D8B19E28070D1F55E28CFDC460B5594F2D10E821_184534912 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Intent.class);
      String var1 = "android";
      byte var2 = 1;
      ((Intent)var3).putExtra(var1, var2);
   }
}
