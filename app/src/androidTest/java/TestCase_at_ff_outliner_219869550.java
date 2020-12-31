import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_ff_outliner_219869550 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Icon var1 = Icon.createWithResource((Context)var0, 2131492864);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
