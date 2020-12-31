import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bne_airport__855024949 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Paint.class);
      Object var1 = null;
      byte var2 = 1;
      ((Paint)var3).measureText((CharSequence)var1, 0, var2);
   }
}
