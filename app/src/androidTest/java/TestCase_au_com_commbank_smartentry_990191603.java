import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry_990191603 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      ArrayList var2 = ((Intent)var1).getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
   }
}
