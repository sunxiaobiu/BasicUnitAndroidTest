import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aplabs_whatson_736106324 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      TaskStackBuilder var3 = TaskStackBuilder.create(var2);
      Object var1 = EasyMock.createMock(Intent.class);
      var3.addNextIntent((Intent)var1);
   }
}
