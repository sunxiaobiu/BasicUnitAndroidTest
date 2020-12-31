import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.core.content.res.ResourcesCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_1133290057 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Theme.class);
      ResourcesCompat.getDrawable((Resources)var0, var1, (Theme)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
