import android.support.v7.widget.AppCompatEditText;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aida_one__184712889 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatEditText.class);
      byte var1 = 1;
      ((AppCompatEditText)var2).setBackgroundResource(var1);
   }
}
