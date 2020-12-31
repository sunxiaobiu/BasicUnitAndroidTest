import android.database.MatrixCursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_mp3__206070914 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(MatrixCursor.class);
      byte var1 = 1;
      ((MatrixCursor)var2).moveToPosition(var1);
   }
}
