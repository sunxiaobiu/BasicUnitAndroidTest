import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945_2142307670 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Cursor.class);
      CrossProcessCursor var2 = (CrossProcessCursor)var1;
      CursorWindow var3 = var2.getWindow();
   }
}
