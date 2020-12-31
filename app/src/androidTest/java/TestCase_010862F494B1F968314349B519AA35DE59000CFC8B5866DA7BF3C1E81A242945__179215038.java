import android.database.CursorWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945__179215038 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(CursorWindow.class);
      byte var1 = 1;
      ((CursorWindow)var2).getShort(var1, 4);
   }
}
