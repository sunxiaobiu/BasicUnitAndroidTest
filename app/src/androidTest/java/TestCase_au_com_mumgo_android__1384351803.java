import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import java.util.regex.Pattern;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android__1384351803 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      Object var1 = null;
      Object var2 = null;
      Linkify.addLinks((TextView)var0, (Pattern)var1, (String)null, (MatchFilter)null, (TransformFilter)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
