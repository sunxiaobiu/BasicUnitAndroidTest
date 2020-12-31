import android.content.SharedPreferences.Editor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_shakthifm__1952121543 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Editor.class);
      String var1 = "android";
      ((Editor)var2).putBoolean(var1, true);
   }
}
