import android.os.Bundle;
import android.support.v4.app.Fragment;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__1959187526 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Fragment.class);
      Object var1 = EasyMock.createMock(Bundle.class);
      ((Fragment)var2).getLayoutInflater((Bundle)var1);
   }
}
