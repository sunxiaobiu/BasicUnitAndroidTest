import android.database.CursorWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tvee_unbalance__517396744 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(CursorWindow.class);
      byte var1 = 1;
      byte var2 = 1;
      ((CursorWindow)var3).isFloat(var1, var2);
   }
}
