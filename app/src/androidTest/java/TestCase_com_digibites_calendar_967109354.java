import android.content.IntentFilter;
import android.util.LogPrinter;
import android.util.Printer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_digibites_calendar_967109354 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(IntentFilter.class);
      Object var1 = EasyMock.createMock(LogPrinter.class);
      ((IntentFilter)var2).dump((Printer)var1, "  ");
   }
}
