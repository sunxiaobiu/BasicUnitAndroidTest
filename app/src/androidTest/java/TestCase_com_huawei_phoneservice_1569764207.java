import android.os.Process;
import android.os.UserHandle;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_huawei_phoneservice_1569764207 {
   @Test
   public void testCase() throws Exception {
      UserHandle var1 = Process.myUserHandle();
      int var2 = var1.hashCode();
   }
}
