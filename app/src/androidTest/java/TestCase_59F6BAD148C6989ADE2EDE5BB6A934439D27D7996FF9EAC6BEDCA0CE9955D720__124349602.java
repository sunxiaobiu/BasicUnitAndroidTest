import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityOptionsCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F6BAD148C6989ADE2EDE5BB6A934439D27D7996FF9EAC6BEDCA0CE9955D720__124349602 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      byte var1 = 1;
      byte var2 = 1;
      ActivityOptionsCompat.makeCustomAnimation((Context)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
