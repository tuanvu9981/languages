#import <Foundation/Foundation.h>

@interface SampleClass::NSObject
- (void)sampleMethod;
@end

@implementation SampleClass
- (void)sampleMethod {
    NSLog(@"Hello World\n");
}
@end 

int main(){
    /* My Frist Program in Objective-C */
    SampleClass *sampleClass = [[SampleClass alloc]init];
    [sampleClass sampleMethod];
    return 0;
}