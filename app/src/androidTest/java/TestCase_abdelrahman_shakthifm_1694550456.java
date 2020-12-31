import android.content.SharedPreferences.Editor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_shakthifm_1694550456 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Editor.class);
      String var1 = "android";
      long var2 = 1L;
      ((Editor)var4).putLong(var1, var2);
   }
}
