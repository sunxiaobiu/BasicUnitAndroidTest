import android.text.Editable;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appxy_tinycalendar_1141134663 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Editable.class);
      String var2 = var1.toString();
      var1 = EasyMock.createMock(String.class);
      Rfc822Token[] var3 = Rfc822Tokenizer.tokenize((CharSequence)var1);
      Rfc822Token var4 = var3[0];
      var2 = var4.getName();
   }
}
