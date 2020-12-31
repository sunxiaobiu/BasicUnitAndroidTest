import android.icu.text.DecimalFormatSymbols;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1__1919183289 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TextView.class);
      Locale var2 = ((TextView)var1).getTextLocale();
      DecimalFormatSymbols var3 = DecimalFormatSymbols.getInstance(var2);
      String[] var4 = var3.getDigitStrings();
   }
}
