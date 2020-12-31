import android.content.Context;
import android.content.Intent;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03FFE13CFF47695C1A3785CC36E8C6FFE6275EAECD78918870CB54BB8A4BB12E__220216633 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent[].class);
      var2.startActivities((Intent[])var1);
   }
}
