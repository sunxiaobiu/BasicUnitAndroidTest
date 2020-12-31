import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_1430972522 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Cursor.class);
      byte var1 = 1;
      ((Cursor)var2).isNull(var1);
   }
}
