import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5997CA36C31CAA68B33B8238A822E7BFA82E3A405EF116ADFF70DA2F98F11BBE__1271196787 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Theme var3 = var2.getTheme();
      int[] var1 = new int[1];
      TypedArray var4 = var3.obtainStyledAttributes(var1);
      TypedValue var5 = var4.peekValue(0);
   }
}
