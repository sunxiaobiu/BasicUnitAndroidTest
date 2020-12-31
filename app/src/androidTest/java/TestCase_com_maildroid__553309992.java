import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_maildroid__553309992 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Intent.class);
      String var1 = "android";
      short[] var2 = new short[1];
      ((Intent)var3).putExtra(var1, var2);
   }
}
