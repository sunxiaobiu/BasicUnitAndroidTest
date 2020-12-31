import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arthurivanets_owly__845981152 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      TaskStackBuilder var2 = TaskStackBuilder.create(var1);
      Intent var3 = var2.editIntentAt(0);
   }
}
