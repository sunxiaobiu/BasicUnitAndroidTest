import android.text.SpannableStringBuilder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cmengler_pidflight__195538941 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SpannableStringBuilder.class);
      byte var1 = 1;
      ((SpannableStringBuilder)var2).subSequence(1, var1);
   }
}
