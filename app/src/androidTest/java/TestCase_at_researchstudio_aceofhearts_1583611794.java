import android.database.CursorWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_researchstudio_aceofhearts_1583611794 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(CursorWindow.class);
      byte var1 = 1;
      ((CursorWindow)var2).getBlob(var1, 6);
   }
}
