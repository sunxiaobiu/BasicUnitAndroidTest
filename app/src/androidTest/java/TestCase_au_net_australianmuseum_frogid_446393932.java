import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_australianmuseum_frogid_446393932 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Cursor.class);
      AbstractWindowedCursor var3 = (AbstractWindowedCursor)var2;
      var2 = null;
      byte var1 = 1;
      ((AbstractWindowedCursor)var2).getType(var1);
   }
}
