import android.database.ContentObserver;
import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_aliexpress_itao_24008136 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Cursor.class);
      Object var1 = null;
      ((Cursor)var2).unregisterContentObserver((ContentObserver)var1);
   }
}
