import android.database.ContentObserver;
import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0736DF926956320220BEC31FA752FB9D23192FFBA7EDE8329209AE30B6C95540__1133398046 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Cursor.class);
      Object var1 = null;
      ((Cursor)var2).registerContentObserver((ContentObserver)var1);
   }
}
