import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A4CB36F8C311DA403C395A463A4CE08E7B2BDD5EC2BF20CA6662063DC6B9EF5_2047868108 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Intent.class);
      String var1 = "android";
      boolean[] var2 = new boolean[1];
      ((Intent)var3).putExtra(var1, var2);
   }
}
