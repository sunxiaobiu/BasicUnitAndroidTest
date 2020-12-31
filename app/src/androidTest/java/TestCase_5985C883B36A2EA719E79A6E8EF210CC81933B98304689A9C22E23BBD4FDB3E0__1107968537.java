import android.text.SpannableStringBuilder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__1107968537 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SpannableStringBuilder.class);
      byte var1 = 1;
      byte var2 = 1;
      ((SpannableStringBuilder)var3).replace(var1, var2, "{");
   }
}
