import android.location.Address;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_1745215224 {
   @Test
   public void testCase() throws Exception {
      Object var2 = null;
      var2 = ((List)var2).get(0);
      Address var3 = (Address)var2;
      byte var1 = 1;
      var3.getAddressLine(var1);
   }
}
