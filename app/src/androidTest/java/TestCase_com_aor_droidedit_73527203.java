import android.graphics.Typeface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aor_droidedit_73527203 {
   @Test
   public void testCase() throws Exception {
      Typeface var2 = Typeface.MONOSPACE;
      Object var1 = EasyMock.createMock(Typeface.class);
      var2.equals(var1);
   }
}
