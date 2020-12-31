import androidx.collection.LruCache;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02D569A781E7CC3EA4C790AA8DCA1EC75B96CBCD38D7BDA9C2FA512E47BFED6B_1246136062 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LruCache.class);
      String var1 = "android";
      ((LruCache)var2).get(var1);
   }
}
