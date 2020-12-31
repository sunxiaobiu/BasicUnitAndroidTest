import android.text.Spannable;
import android.text.style.CharacterStyle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asana_app_1209652716 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Spannable.class);
      byte var1 = 1;
      byte var2 = 1;
      ((Spannable)var3).nextSpanTransition(var1, var2, CharacterStyle.class);
   }
}
