import androidx.test.runner.AndroidJUnit4;
import androidx.work.NetworkType;
import androidx.work.Constraints.Builder;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59B76F961C678ED90E111FF383FCE11B5FBB677EEDC8E5754F41C1AFB95C8B66__354270245 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(NetworkType.class);
      var2.setRequiredNetworkType((NetworkType)var1);
   }
}
