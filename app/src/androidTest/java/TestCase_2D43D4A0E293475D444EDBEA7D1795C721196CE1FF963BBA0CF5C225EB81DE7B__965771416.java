import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_2D43D4A0E293475D444EDBEA7D1795C721196CE1FF963BBA0CF5C225EB81DE7B__965771416 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(AttributeSet.class);
      Intent.parseIntent((Resources)var0, (XmlPullParser)var1, (AttributeSet)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
