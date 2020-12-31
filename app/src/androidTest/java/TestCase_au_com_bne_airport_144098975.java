import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bne_airport_144098975 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      TaskStackBuilder var3 = TaskStackBuilder.create(var2);
      Object var1 = EasyMock.createMock(Intent.class);
      var3.addNextIntent((Intent)var1);
   }
}
