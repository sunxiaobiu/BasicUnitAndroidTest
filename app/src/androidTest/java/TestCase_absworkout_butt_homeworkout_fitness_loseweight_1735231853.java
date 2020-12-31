import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_1735231853 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      ContentResolver var4 = var3.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      Object var2 = EasyMock.createMock(ContentValues.class);
      var4.insert((Uri)var1, (ContentValues)var2);
   }
}
