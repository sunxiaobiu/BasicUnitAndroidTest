import android.database.CursorWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945__1968012564 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(CursorWindow.class);
      byte var3 = 1;
      byte var4 = 1;
      ((CursorWindow)var5).getDouble(var3, var4);
   }
}
